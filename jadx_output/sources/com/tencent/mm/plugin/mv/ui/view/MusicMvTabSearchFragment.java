package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvTabSearchFragment extends com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment {

    /* renamed from: w, reason: collision with root package name */
    public int f151731w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f151732x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f151733y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvTabSearchFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public void c(dm.i8 i8Var, java.lang.String str) {
        this.music = i8Var;
        this.keyword = str;
        if (this.f151733y == null) {
            this.f151733y = java.util.UUID.randomUUID().toString();
        }
        java.lang.String str2 = this.f151733y;
        if (str2 == null || str == null) {
            return;
        }
        java.lang.String str3 = str.length() > 0 ? str : null;
        if (str3 != null) {
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, 93);
            pm0.v.T(new bq.o1(str3, this.f151731w, str2, this.f151732x, 12, qt2Var, null, null, null, null, false, 0, 4032, null).l(), new com.tencent.mm.plugin.mv.ui.view.b4(this));
            com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
            c17.f59491t = c17.b("KeyWord", str3, true);
            c17.f59492u = c17.b("ExpId", "", true);
            c17.f59482k = 3L;
            c17.k();
            c17.o();
        }
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getFeedFrom() {
        return 7;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getType() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvTabSearchFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3820, this);
    }
}
