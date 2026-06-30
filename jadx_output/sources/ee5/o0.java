package ee5;

/* loaded from: classes9.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.q0 f251985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f251986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ee5.q0 q0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251985d = q0Var;
        this.f251986e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.o0(this.f251985d, this.f251986e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ee5.q0 q0Var = this.f251985d;
        boolean isFinishing = q0Var.getActivity().isFinishing();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isFinishing) {
            return f0Var;
        }
        androidx.appcompat.app.AppCompatActivity activity = q0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        de5.a.f229396a.l(str);
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = q0Var.f252001r;
        if (emojiHistoryListFragment != null) {
            emojiHistoryListFragment.f200554w = true;
        }
        if (emojiHistoryListFragment != null) {
            emojiHistoryListFragment.r0(this.f251986e, str);
        }
        return f0Var;
    }
}
