package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class q1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f132864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f132865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f132866d;

    public q1(android.content.Context context, int i17, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f132863a = context;
        this.f132864b = i17;
        this.f132865c = c0Var;
        this.f132866d = continuation;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlin.coroutines.Continuation continuation = this.f132866d;
        kotlin.jvm.internal.c0 c0Var = this.f132865c;
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.view.s1 s1Var = com.tencent.mm.plugin.finder.view.s1.f132991a;
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f132863a.getResources(), bitmap);
            int i18 = this.f132864b;
            try {
                i17 = (int) ((i18 * bitmap.getWidth()) / bitmap.getHeight());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EcShowBoxUtil", "buildImageSpan " + e17.getMessage());
                i17 = i18 * 2;
            }
            bitmapDrawable.setBounds(0, 0, i17, i18);
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(wVar));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
