package em;

/* loaded from: classes10.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254351a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.flexbox.FlexboxLayout f254352b;

    public g2(android.view.View view) {
        this.f254351a = view;
    }

    public com.google.android.flexbox.FlexboxLayout a() {
        if (this.f254352b == null) {
            this.f254352b = (com.google.android.flexbox.FlexboxLayout) this.f254351a.findViewById(com.tencent.mm.R.id.uhw);
        }
        return this.f254352b;
    }
}
