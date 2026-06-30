package z22;

/* loaded from: classes10.dex */
public abstract class h extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f469724d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f469725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z22.l lVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f469724d = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.da9);
        this.f469725e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.da_);
        itemView.setOnClickListener(new z22.g(this, lVar, itemView));
    }

    public abstract void i(int i17, r45.p64 p64Var);
}
