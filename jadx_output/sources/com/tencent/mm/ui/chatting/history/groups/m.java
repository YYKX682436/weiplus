package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes10.dex */
public final class m implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.m f201774d = new com.tencent.mm.ui.chatting.history.groups.m();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        uc5.k0 k0Var;
        uc5.h0 h0Var;
        uc5.l0 l0Var = (uc5.l0) obj;
        uc5.l0 l0Var2 = (uc5.l0) obj2;
        boolean z17 = l0Var instanceof uc5.i0;
        if (!z17 || !(l0Var2 instanceof uc5.i0)) {
            if (z17) {
                return -1;
            }
            if (!(l0Var2 instanceof uc5.i0)) {
                if (!(l0Var instanceof uc5.j0) && !(l0Var2 instanceof uc5.j0)) {
                    boolean z18 = l0Var instanceof uc5.k0;
                    long j17 = 0;
                    long T1 = z18 ? ((uc5.k0) l0Var).f426520g : l0Var instanceof uc5.h0 ? ((uc5.h0) l0Var).f426494d.p().T1() : 0L;
                    boolean z19 = l0Var2 instanceof uc5.k0;
                    long T12 = z19 ? ((uc5.k0) l0Var2).f426520g : l0Var2 instanceof uc5.h0 ? ((uc5.h0) l0Var2).f426494d.p().T1() : 0L;
                    if (z18 != z19) {
                        if (z18) {
                            kotlin.jvm.internal.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Timeline");
                            k0Var = (uc5.k0) l0Var;
                        } else {
                            kotlin.jvm.internal.o.e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Timeline");
                            k0Var = (uc5.k0) l0Var2;
                        }
                        if (z18) {
                            kotlin.jvm.internal.o.e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Content");
                            h0Var = (uc5.h0) l0Var2;
                        } else {
                            kotlin.jvm.internal.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Content");
                            h0Var = (uc5.h0) l0Var;
                        }
                        if (kotlin.jvm.internal.o.b(uc5.q0.a(uc5.q0.f426543a, h0Var.f426494d.p().T1(), 0L, 2, null).f426540a, k0Var.f426518e)) {
                            if (z18) {
                                return -1;
                            }
                        }
                    }
                    int j18 = kotlin.jvm.internal.o.j(T1, T12);
                    if (j18 != 0) {
                        return j18;
                    }
                    if (z18 && !z19) {
                        return -1;
                    }
                    if (z18 || !z19) {
                        long msgId = z18 ? ((uc5.k0) l0Var).f426521h : l0Var instanceof uc5.h0 ? ((uc5.h0) l0Var).f426494d.p().getMsgId() : 0L;
                        if (z19) {
                            j17 = ((uc5.k0) l0Var2).f426521h;
                        } else if (l0Var2 instanceof uc5.h0) {
                            j17 = ((uc5.h0) l0Var2).f426494d.p().getMsgId();
                        }
                        return kotlin.jvm.internal.o.j(msgId, j17);
                    }
                }
            }
            return 1;
        }
        return 0;
    }
}
