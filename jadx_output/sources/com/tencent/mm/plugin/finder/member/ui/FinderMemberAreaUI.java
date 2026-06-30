package com.tencent.mm.plugin.finder.member.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberAreaUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/tr0;", "Lrd2/b;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderMemberAreaUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.tr0> implements rd2.b {
    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.b2l;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 204;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{eo2.b.class, go2.g.class, go2.z.class, go2.c0.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class)), com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class});
    }
}
