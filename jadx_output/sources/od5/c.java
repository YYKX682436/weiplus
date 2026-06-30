package od5;

/* loaded from: classes9.dex */
public final class c implements com.tencent.mm.ui.chatting.adapter.q {

    /* renamed from: b, reason: collision with root package name */
    public final in5.s0 f344656b;

    public c(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f344656b = holder;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.q
    public int getAdapterPosition() {
        com.tencent.mm.pluginsdk.ui.tools.r3 r3Var;
        in5.s0 holder = this.f344656b;
        int adapterPosition = holder.getAdapterPosition();
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.gyi);
        java.lang.ref.WeakReference weakReference = tag instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) tag : null;
        if (weakReference == null || (r3Var = (com.tencent.mm.pluginsdk.ui.tools.r3) weakReference.get()) == null) {
            return adapterPosition;
        }
        kotlin.jvm.internal.o.g(holder, "holder");
        return holder.getAdapterPosition() - r3Var.y();
    }

    @Override // com.tencent.mm.ui.chatting.adapter.q
    public kotlinx.coroutines.y0 getViewHolderScope() {
        return this.f344656b.f293120d;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getAdapterPosition());
    }
}
