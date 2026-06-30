package em;

/* loaded from: classes11.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254811a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254812b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.CheckBox f254813c;

    public t1(android.view.View view) {
        this.f254811a = view;
    }

    public android.widget.CheckBox a() {
        if (this.f254813c == null) {
            this.f254813c = (android.widget.CheckBox) this.f254811a.findViewById(com.tencent.mm.R.id.srw);
        }
        return this.f254813c;
    }

    public android.widget.TextView b() {
        if (this.f254812b == null) {
            this.f254812b = (android.widget.TextView) this.f254811a.findViewById(com.tencent.mm.R.id.vhb);
        }
        return this.f254812b;
    }
}
