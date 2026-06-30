package em;

/* loaded from: classes3.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254700a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f254701b;

    public p1(android.view.View view) {
        this.f254700a = view;
    }

    public com.tencent.mm.plugin.scanner.MultiCodeMaskView a() {
        if (this.f254701b == null) {
            this.f254701b = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) this.f254700a.findViewById(com.tencent.mm.R.id.jun);
        }
        return this.f254701b;
    }
}
