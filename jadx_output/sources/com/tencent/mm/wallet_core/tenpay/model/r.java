package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public abstract class r extends com.tencent.mm.wallet_core.tenpay.model.o implements com.tencent.mm.wallet_core.tenpay.model.a {
    private static final java.lang.String TAG = "MicroMsg.NetSceneTenpayRetriableBase";
    private boolean can_pay_retry2;
    private com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo retryPayInfo;
    private boolean shouldRetr = false;
    private int errCode = 0;
    private java.lang.String errMsg = "";
    private boolean hasRetried = false;
    private boolean hasCGiRetried = false;
    public boolean isPaySuccess = false;

    public boolean canPayRetry() {
        return this.can_pay_retry2;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public boolean canRetry() {
        return false;
    }

    public boolean checkPaySuccess() {
        return this.isPaySuccess;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.wallet_core.model.z0
    public void configRequest(boolean z17, boolean z18) {
        super.configRequest(z17, z18);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public boolean getHasRetried() {
        return this.hasRetried;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.a
    public com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo getRetryPayInfo() {
        return this.retryPayInfo;
    }

    public boolean isShouldRetr() {
        return this.shouldRetr;
    }

    public boolean ishasCGiRetried() {
        return this.hasCGiRetried;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.errCode = i17;
        this.errMsg = str;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        boolean z17 = false;
        if (jSONObject != null && jSONObject.optInt("can_pay_retry") == 1) {
            z17 = true;
        }
        this.can_pay_retry2 = z17;
        com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo = new com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo();
        this.retryPayInfo = iTenpaySave$RetryPayInfo;
        iTenpaySave$RetryPayInfo.a(jSONObject);
    }

    public void resetForRetry() {
        reset();
        this.hasCGiRetried = true;
        this.isFake = false;
    }

    public void setErrCode(int i17) {
        this.errCode = i17;
    }

    public void setErrMsg(java.lang.String str) {
        this.errMsg = str;
    }

    public void setHasRetried(boolean z17) {
        this.hasRetried = z17;
    }

    public void setPaySuccess(boolean z17) {
        this.isPaySuccess = z17;
    }

    public void setRetry() {
        reset();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_retry_pay", "1");
        addRequestData(hashMap);
        this.hasCGiRetried = true;
        this.isFake = false;
    }

    public void setShouldRetr(boolean z17) {
        this.shouldRetr = z17;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean shouldResolveJsonWhenError() {
        return !getHasRetried();
    }

    public void updateConfig(int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("retry_count", i17 + "");
        hashMap.put("is_last_retry", i18 + "");
        addRequestData(hashMap);
    }
}
