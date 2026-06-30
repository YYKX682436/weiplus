package qf4;

/* loaded from: classes4.dex */
public final class b extends qf4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf4.f f362681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qf4.f fVar, android.view.View view) {
        super(fVar, view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f362681d = fVar;
    }

    @Override // qf4.e
    public void i(int i17) {
        this.itemView.setOnClickListener(new qf4.a(this.f362681d));
    }
}
