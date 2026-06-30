package zh5;

/* loaded from: classes12.dex */
public final class q implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh5.v f473060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf3.k f473062c;

    public q(zh5.v vVar, java.lang.String str, mf3.k kVar) {
        this.f473060a = vVar;
        this.f473061b = str;
        this.f473062c = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            kotlin.jvm.internal.o.d(str);
            this.f473060a.W6(this.f473061b, str, this.f473062c);
        }
    }
}
