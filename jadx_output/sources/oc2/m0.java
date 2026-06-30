package oc2;

/* loaded from: classes8.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f344225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.widget.TextView textView) {
        super(0);
        this.f344225d = textView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float[] fArr = new float[1];
        this.f344225d.getPaint().getTextWidths("$", 0, 1, fArr);
        return java.lang.Float.valueOf(fArr[0]);
    }
}
