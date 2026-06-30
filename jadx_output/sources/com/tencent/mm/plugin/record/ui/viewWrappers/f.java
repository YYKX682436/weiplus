package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class f implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.g f155510a;

    public f(com.tencent.mm.plugin.record.ui.viewWrappers.g gVar) {
        this.f155510a = gVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f155510a.f155511d.f155513d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f491022bm2, q75.c.c(str2)), 1).show();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.record.ui.viewWrappers.e(this, str2));
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f155510a.f155511d.f155513d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ccq), 1).show();
    }
}
