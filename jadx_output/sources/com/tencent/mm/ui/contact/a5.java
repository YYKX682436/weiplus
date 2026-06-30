package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public abstract class a5 extends com.tencent.mm.ui.contact.p4 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f206587i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f206588m;

    public a5(com.tencent.mm.ui.contact.l4 l4Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        this(l4Var, list, z17, z18, 0, z19);
    }

    public int r(java.lang.String str) {
        return -1;
    }

    public void s() {
    }

    public a5(com.tencent.mm.ui.contact.l4 l4Var, java.util.List list, boolean z17, boolean z18) {
        this(l4Var, list, z17, z18, 0);
    }

    public a5(com.tencent.mm.ui.contact.l4 l4Var, java.util.List list, boolean z17, boolean z18, int i17) {
        this(l4Var, list, z17, z18, i17, false);
    }

    public a5(com.tencent.mm.ui.contact.l4 l4Var, java.util.List list, boolean z17, boolean z18, int i17, boolean z19) {
        super(l4Var, z18, i17, z19);
        this.f206588m = list;
        this.f206587i = z17;
    }
}
