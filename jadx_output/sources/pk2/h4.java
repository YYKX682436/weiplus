package pk2;

/* loaded from: classes3.dex */
public final class h4 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355813i = n() ? "anchorlive.more.commentmanage.sensitivity" : "startlive.more.commentmanage.sensitivity";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355813i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 moreCommentSettingBottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(moreCommentSettingBottomSheet, "moreCommentSettingBottomSheet");
        android.view.View findViewById = moreCommentSettingBottomSheet.f131959f.findViewById(com.tencent.mm.R.id.f485513hy1);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.g4(o9Var, moreCommentSettingBottomSheet, this));
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.y4 y4Var = ml2.j0.f327583i;
        ((ml2.j0) c17).Nj("live_sensitive_word_button", "view_exp", null);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.mmr);
    }
}
