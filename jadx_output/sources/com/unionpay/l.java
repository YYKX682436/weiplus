package com.unionpay;

/* loaded from: classes7.dex */
public final class l implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220718d;

    public l(java.lang.String str) {
        this.f220718d = "";
        this.f220718d = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = this.f220718d;
        long optLong = ((org.json.JSONObject) obj).optLong(str);
        long optLong2 = ((org.json.JSONObject) obj2).optLong(str);
        if (optLong < optLong2) {
            return -1;
        }
        return optLong > optLong2 ? 1 : 0;
    }
}
