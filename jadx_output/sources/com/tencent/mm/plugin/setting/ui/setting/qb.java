package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tb f161470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.setting.ui.setting.tb tbVar) {
        super(0);
        this.f161470d = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.tb tbVar = this.f161470d;
        android.app.Activity context = tbVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.setting.ui.setting.hb hbVar = (com.tencent.mm.plugin.setting.ui.setting.hb) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.setting.ui.setting.hb.class);
        java.lang.String str = tbVar.f161570d;
        if (str == null) {
            str = "";
        }
        hbVar.getClass();
        hbVar.X6();
        hbVar.W6(str, false);
        return jz5.f0.f302826a;
    }
}
