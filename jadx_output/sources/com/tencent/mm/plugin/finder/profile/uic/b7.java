package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b7 implements ya2.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123555d;

    public b7(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123555d = obVar;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123555d;
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf()) {
            android.app.Activity context2 = obVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag() && cmdItem.getInteger(0) == 106) {
                com.tencent.mm.plugin.finder.profile.uic.ob.G7(obVar, "handleCmd", null, 2, null);
            }
        }
    }
}
