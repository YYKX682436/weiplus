package f12;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258670e;

    public s(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, java.lang.String str) {
        this.f258669d = springLuckyEggActivity;
        this.f258670e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f12.c0 c0Var = this.f258669d.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258588q.setImageFilePath(this.f258670e);
    }
}
