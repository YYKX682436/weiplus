package yt2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.g f465290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yt2.g gVar) {
        super(0);
        this.f465290d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f465290d.e().findViewById(com.tencent.mm.R.id.t0g);
        textView.setTextSize(2, 12.0f);
        return textView;
    }
}
