package dt2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.h f243174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f243175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.w94 f243176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dt2.h hVar, android.graphics.Bitmap bitmap, r45.w94 w94Var) {
        super(0);
        this.f243174d = hVar;
        this.f243175e = bitmap;
        this.f243176f = w94Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dt2.h hVar = this.f243174d;
        hVar.f243180d.setImageBitmap(this.f243175e);
        android.view.View view = hVar.f243183g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hVar.setDimension(r2.getWidth() / r2.getHeight());
        hVar.f243182f.setOnClickListener(new dt2.e(hVar, this.f243176f));
        return jz5.f0.f302826a;
    }
}
