package z22;

/* loaded from: classes10.dex */
public final class e extends z22.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z22.f fVar, android.view.View itemView) {
        super(fVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // z22.a
    public void i(int i17, r45.p64 info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.widget.TextView textView = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.da_);
        u22.l lVar = u22.r.f424006p;
        if (kotlin.jvm.internal.o.b(info, u22.r.f424010t)) {
            textView.setText(com.tencent.mm.R.string.bv6);
        } else if (kotlin.jvm.internal.o.b(info, u22.r.f424012v)) {
            textView.setText(com.tencent.mm.R.string.bv9);
        }
    }
}
