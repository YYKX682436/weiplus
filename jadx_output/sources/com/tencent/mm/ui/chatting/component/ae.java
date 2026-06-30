package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class ae implements androidx.core.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f198619a;

    public ae(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f198619a = leVar;
    }

    @Override // androidx.core.widget.o
    public void a(androidx.core.widget.NestedScrollView nestedScrollView, int i17, int i18, int i19, int i27) {
        com.tencent.mm.ui.chatting.component.le leVar = this.f198619a;
        if (i18 == 0) {
            leVar.f199423r.setVisibility(8);
        } else {
            leVar.f199423r.setVisibility(0);
        }
    }
}
