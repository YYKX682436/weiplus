package te2;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.g8 f418242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(te2.p1 p1Var, com.tencent.mm.plugin.finder.live.plugin.g8 g8Var) {
        super(0);
        this.f418241d = p1Var;
        this.f418242e = g8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        te2.k0 k0Var = this.f418241d.f418290h;
        if (k0Var != null) {
            int i17 = this.f418242e.f112645c;
            com.tencent.mm.plugin.finder.live.widget.d7 d7Var = ((te2.q1) k0Var).f418350i;
            if (d7Var != null) {
                android.widget.SeekBar seekBar = d7Var.Z;
                if (seekBar != null) {
                    seekBar.setProgress(i17);
                }
                android.widget.TextView textView = d7Var.f118081p0;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(i17));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
