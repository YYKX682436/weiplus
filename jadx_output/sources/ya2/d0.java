package ya2;

/* loaded from: classes2.dex */
public final class d0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f460464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f460467d;

    public d0(int i17, android.content.Context context, android.content.Intent intent, boolean z17) {
        this.f460464a = i17;
        this.f460465b = context;
        this.f460466c = intent;
        this.f460467d = z17;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        boolean z17 = this.f460467d;
        android.content.Intent intent = this.f460466c;
        android.content.Context context = this.f460465b;
        int i17 = this.f460464a;
        if (i17 < 0 || !(context instanceof android.app.Activity)) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent, z17);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).tk((android.app.Activity) context, intent, i17, z17);
        }
        w04.l.INSTANCE.b(540999685);
    }
}
