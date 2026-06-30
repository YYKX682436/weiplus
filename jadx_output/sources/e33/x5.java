package e33;

/* loaded from: classes8.dex */
public class x5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f247547d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f247548e;

    public x5(android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdh);
        this.f247547d = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f247548e = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.bdg);
    }
}
