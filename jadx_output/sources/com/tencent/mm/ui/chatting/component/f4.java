package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class f4 implements com.tencent.mm.pluginsdk.ui.chat.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m53.i f199008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h4 f199009b;

    public f4(com.tencent.mm.ui.chatting.component.h4 h4Var, m53.i iVar) {
        this.f199009b = h4Var;
        this.f199008a = iVar;
    }

    public java.lang.String a() {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.util.LinkedList linkedList2;
        u53.b0 b0Var = (u53.b0) i95.n0.c(u53.b0.class);
        java.lang.String x17 = this.f199009b.f198580d.x();
        int i17 = this.f199008a.f323763d;
        ((d63.e) b0Var).getClass();
        v53.c cVar = ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(x17)).field_extInfo;
        java.lang.Object obj2 = null;
        if (cVar == null || (cVar.f433331e & (1 << (i17 - 1))) == 0) {
            return null;
        }
        m53.m h17 = com.tencent.mm.plugin.game.commlib.i.h();
        if (h17 != null && (linkedList = h17.f323888d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((m53.i) obj).f323763d == i17) {
                    break;
                }
            }
            m53.i iVar = (m53.i) obj;
            if (iVar != null && (linkedList2 = iVar.f323772p) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((m53.z) next).f324213d, com.tencent.mm.sdk.platformtools.m2.d())) {
                        obj2 = next;
                        break;
                    }
                }
                m53.z zVar = (m53.z) obj2;
                if (zVar != null) {
                    return zVar.f324214e;
                }
            }
        }
        return i65.a.r(com.tencent.mm.sdk.platformtools.i.a(), com.tencent.mm.R.string.fqh);
    }
}
