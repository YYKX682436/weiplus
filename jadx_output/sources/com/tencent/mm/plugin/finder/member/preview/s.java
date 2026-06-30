package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f121275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.member.preview.c0 c0Var, r45.qt2 qt2Var) {
        super(1);
        this.f121274d = c0Var;
        this.f121275e = qt2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121274d;
        if (fVar != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.h07 h07Var = ((r45.tr0) fVar.f70618d).f386728i;
            r45.qt2 qt2Var = this.f121275e;
            if (h07Var != null && (linkedList2 = h07Var.f375731e) != null) {
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : linkedList2) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    kotlin.jvm.internal.o.d(finderObject);
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, qt2Var.getInteger(5), null);
                }
            }
            r45.h07 h07Var2 = ((r45.tr0) fVar.f70618d).f386728i;
            if (h07Var2 != null && (linkedList = h07Var2.f375733g) != null) {
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : linkedList) {
                    i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    kotlin.jvm.internal.o.d(finderObject2);
                    ((com.tencent.mm.plugin.finder.report.o3) c18).rk(finderObject2, qt2Var.getInteger(5), null);
                }
            }
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            c0Var.f255580d = fVar2;
            androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
            java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents = mMFinderUI != null ? mMFinderUI.getUiComponents() : null;
            if (uiComponents != null) {
                for (com.tencent.mm.ui.component.UIComponent uIComponent : uiComponents) {
                    eo2.j jVar = uIComponent instanceof eo2.j ? (eo2.j) uIComponent : null;
                    if (jVar != null) {
                        jVar.R6(fVar2);
                    }
                }
            }
            eo2.f.f255565a.f(c0Var.U, fVar);
        } else {
            int i17 = fVar != null ? fVar.f70616b : 0;
            java.lang.String str = fVar != null ? fVar.f70617c : null;
            if (str == null) {
                str = "";
            }
            androidx.appcompat.app.AppCompatActivity activity2 = c0Var.getActivity();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = activity2 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity2 : null;
            java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents2 = mMFinderUI2 != null ? mMFinderUI2.getUiComponents() : null;
            if (uiComponents2 != null) {
                for (com.tencent.mm.ui.component.UIComponent uIComponent2 : uiComponents2) {
                    eo2.j jVar2 = uIComponent2 instanceof eo2.j ? (eo2.j) uIComponent2 : null;
                    if (jVar2 != null) {
                        jVar2.Q6(i17, str);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
