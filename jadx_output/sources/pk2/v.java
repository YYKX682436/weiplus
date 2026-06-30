package pk2;

/* loaded from: classes3.dex */
public final class v extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356296i = n() ? "anchorlive.more.commentmanage.assistant" : "startlive.more.commentmanage.assistant";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356296i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 moreCommentSettingBottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(moreCommentSettingBottomSheet, "moreCommentSettingBottomSheet");
        android.view.View findViewById = moreCommentSettingBottomSheet.f131959f.findViewById(com.tencent.mm.R.id.f485501hw4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.u(o9Var, moreCommentSettingBottomSheet, this));
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.c7l);
    }
}
