package com.springboot.tarea07d.auth;

public class JwtConfig {

	public static final String RSAPRIVADA ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQD4GK717EoUjQjy\r\n"
			+ "2tCyGGsDUJrCHPPkulSH9W846WBIYpoUtqHTsF0q68Bwhr413OOnBr2Cyk8r9/7B\r\n"
			+ "HekTc6pnSqSlFMfsHT0Tw9ZoooptbBrdnRCWCc0ecG0c8dVnrB7T+dBMKvSEcX96\r\n"
			+ "Is0NCLJ/M4qYS1/IlpZa9qoEkw/xe3zhityhDjK+Db6VOyQcYMGWb9P1TnZUyc3c\r\n"
			+ "rvQeLXSMr+eyYPE+9giGkU1WDDyeYSScORqINWmjXM4fwGI/8Z9S+nf5FIXF38TC\r\n"
			+ "3b1JHVEDlSBgmAdDP2yyo7DtsZsthG0We0j3dt1Ew7O21xRqT3XVZ1+4rbqLyL55\r\n"
			+ "PPwyw4exAgMBAAECggEAakEIDcMZJxwQDRKx9tSGYHERFrmXqwoyUdhHvjQVTGsO\r\n"
			+ "WnitbiBGhq9ZR9gtdpwX090LJQzIQ6h+ru7Ed9Q90uchBKKVzQXotqJVHZMffiWi\r\n"
			+ "i+9MvzWLZ9H2qULZhwEsYtTG5RgwiNijJAfrkf17lQbaAMenSh1UX7jsr/DcDytg\r\n"
			+ "POHcxEM9wfPFIQBVV8nTVu0YlIH1WEMR7otRvTWRhpyC3TFLKwebRcLshYmnOtPB\r\n"
			+ "MueTMEYCjNpWvjBi+ZzIk3qLGnj1bw9IJGSmsKWLflkwhshTz5Y3w3Nlr6Csdr3/\r\n"
			+ "i+Je0CIKN74EdtDEFyjE746z6Y0XtWT/uFU4OQ5GUQKBgQD9oPGDW4UO5XMGT79w\r\n"
			+ "0VTzxhfDD0HE4ii7CwM1Y1vPlji2lUxqFzqMnOdPe8VhgakFWS/hjeKDDLL8RQbT\r\n"
			+ "zrKwR07u8nE49hazR6sLanPj1IvjYNr2ZCdKirKLyKFGgvRBwsZgATbtJcbJHeqo\r\n"
			+ "HfnQM5zzo5JJ0ucaWA2ksgSHuwKBgQD6an+mVygmdkTrqy8Z/b8gALddGLzQutMu\r\n"
			+ "T/aIQY5rBsE9EH3/G5hB0dIaFg1jcbJuORG0N9wDkPbEBchSQ5JQRRogrP+/liLS\r\n"
			+ "xS2PIFQqM8XKstMv9KMaOVoYh9Z3104dTOdEqCsxvMYnXsI47ljR9KWBpDhcFjKy\r\n"
			+ "IHux/v2JgwKBgFSt/JTH5KfxkbLkw10udvehBuP4XxQWElVIuvyDPO8VD8BeHpI5\r\n"
			+ "STITXONbxq3kdYM0oNjk32Czx7qUbVAgbeaPGFqNFaJX/4JCBmicVS8XEtGKz/B9\r\n"
			+ "xeSMZEppZPc+18BxAHyjSyxodXNGiscwouyRnvB1h20gfkp8Zam8SejrAoGAIsNq\r\n"
			+ "GSN8VWqRws2u6kLJp52x1uC6RZfJ/WHobZ38MWtspBeIBkREbM6+BhUNosKD7L1L\r\n"
			+ "ceNXTb9wImJTHuh2hWIycFrT3jrvdqcc3gO0627ohG0y2DNz+Q4BLeqdoWFoXLTy\r\n"
			+ "Xhuic3MrZwfGmrSr6+m0mDy9/jquqv/LbDhj5hUCgYEA0xw4mZMEXAhPKJWMu2t0\r\n"
			+ "tCZMGgm29FfNf1WrvXfq42B1rAVlfKS9jkhjtl+LUevnM+dmBYoGGXGUVaW8D653\r\n"
			+ "UCmXTHzVtmWO+ddxd3XyREpq/KcO4vdBRdriw/e0hXEJNj8sNGPEIQfleRNRY7dl\r\n"
			+ "IyUzRmelRFz7QHXCSnt4ncg=";
	
	public static final String RSAPUBLICA ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA+Biu9exKFI0I8trQshhr\r\n"
			+ "A1Cawhzz5LpUh/VvOOlgSGKaFLah07BdKuvAcIa+Ndzjpwa9gspPK/f+wR3pE3Oq\r\n"
			+ "Z0qkpRTH7B09E8PWaKKKbWwa3Z0QlgnNHnBtHPHVZ6we0/nQTCr0hHF/eiLNDQiy\r\n"
			+ "fzOKmEtfyJaWWvaqBJMP8Xt84YrcoQ4yvg2+lTskHGDBlm/T9U52VMnN3K70Hi10\r\n"
			+ "jK/nsmDxPvYIhpFNVgw8nmEknDkaiDVpo1zOH8BiP/GfUvp3+RSFxd/Ewt29SR1R\r\n"
			+ "A5UgYJgHQz9ssqOw7bGbLYRtFntI93bdRMOzttcUak911WdfuK26i8i+eTz8MsOH\r\n"
			+ "sQIDAQAB";
}
