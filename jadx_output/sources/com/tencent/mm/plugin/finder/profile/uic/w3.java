package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(0);
        this.f124313d = f4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f124313d.getIntent().getStringExtra("key_poi_interaction_info");
        if (stringExtra == null) {
            return null;
        }
        if (!(stringExtra.length() > 0)) {
            return null;
        }
        r45.so2 so2Var = new r45.so2();
        byte[] c17 = ot5.e.c(stringExtra);
        if (c17 == null) {
            return null;
        }
        try {
            so2Var.parseFrom(c17);
            return so2Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return null;
        }
    }
}
