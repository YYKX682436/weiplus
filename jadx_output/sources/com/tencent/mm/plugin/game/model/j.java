package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class j implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rk4 f140340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f140341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.k f140342c;

    public j(r45.rk4 rk4Var, java.util.List list, com.tencent.mm.plugin.game.model.k kVar) {
        this.f140340a = rk4Var;
        this.f140341b = list;
        this.f140342c = kVar;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "menu icon download success! thumburl:%s", this.f140340a.f384966f);
            com.tencent.mm.plugin.game.model.l.a(this.f140341b, this.f140342c);
        }
    }
}
