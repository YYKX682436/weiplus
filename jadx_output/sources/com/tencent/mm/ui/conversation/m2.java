package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class m2 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f207864b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f207865c = false;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f207863a = null;

    public m2(com.tencent.mm.ui.conversation.o2 o2Var) {
    }

    public com.tencent.mm.storage.z3 a() {
        if (this.f207865c && this.f207863a == null) {
            this.f207863a = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f207864b, true);
        }
        return this.f207863a;
    }
}
