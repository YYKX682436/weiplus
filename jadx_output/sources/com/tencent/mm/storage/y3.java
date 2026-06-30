package com.tencent.mm.storage;

/* loaded from: classes5.dex */
public class y3 extends com.tencent.mm.sdk.platformtools.r2 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.regex.Pattern f196352i;

    public y3(int i17) {
        super(i17);
        this.f196352i = java.util.regex.Pattern.compile("_");
    }

    @Override // com.tencent.mm.sdk.platformtools.r2
    public java.lang.Object n(java.lang.Object obj) {
        return this.f196352i.split((java.lang.String) obj);
    }
}
