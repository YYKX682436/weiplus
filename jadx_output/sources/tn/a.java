package tn;

/* loaded from: classes3.dex */
public final class a extends com.tencent.mm.chatroom.ui.q8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.ArrayList memberList, com.tencent.mm.storage.a3 a3Var, com.tencent.mm.chatroom.ui.r8 r8Var) {
        super(memberList, a3Var, r8Var);
        kotlin.jvm.internal.o.g(memberList, "memberList");
    }

    @Override // com.tencent.mm.chatroom.ui.q8, androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.chatroom.ui.u8 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.e0n, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.chatroom.ui.u8(context, this.f64457e, inflate, this.f64458f);
    }
}
