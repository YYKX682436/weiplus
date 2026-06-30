package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class zb extends com.tencent.mm.ui.chatting.db {
    public final jz5.g A;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f206287z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f206287z = jz5.h.b(new com.tencent.mm.ui.chatting.yb(this));
        this.A = jz5.h.b(new com.tencent.mm.ui.chatting.xb(activity, this));
    }

    @Override // com.tencent.mm.ui.chatting.db
    public int X6() {
        return (int) (((java.lang.Number) ((jz5.n) this.f206287z).getValue()).intValue() * 0.75f);
    }

    @Override // com.tencent.mm.ui.chatting.db
    public int e7(int i17) {
        return i17;
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
