package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class VM {
    public static int getVendorInfo(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        return new com.tencent.tmsqmsp.oaid2.VendorManager().getVendorInfo(context, iVendorCallback);
    }
}
