package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f208785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s75.b f208786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f208787f;

    public ha(com.tencent.mm.ui.ga gaVar, boolean z17, s75.b bVar) {
        this.f208787f = gaVar;
        this.f208785d = z17;
        this.f208786e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.ui.ga.f208628v0;
        com.tencent.mm.ui.ga gaVar = this.f208787f;
        boolean z18 = this.f208785d;
        if (!z17 && z18) {
            db5.m9.a(z18, new android.content.Intent().putExtra("classname", gaVar.v()).putExtra("main_process", false));
            return;
        }
        db5.m9.a(z18, new android.content.Intent().putExtra("classname", gaVar.v() + this.f208786e));
    }
}
