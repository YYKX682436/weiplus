package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class g8 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i8 f143588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f143589b;

    public g8(com.tencent.mm.plugin.lite.jsapi.comms.i8 i8Var, com.tencent.mm.ui.da daVar) {
        this.f143588a = i8Var;
        this.f143589b = daVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f143588a.f143617a != i17) {
            return false;
        }
        this.f143589b.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
