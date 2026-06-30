package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class k8 implements com.tencent.mm.ui.conversation.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.k8 f207814a = new com.tencent.mm.ui.conversation.k8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f207815b = kz5.c0.i(com.tencent.mm.ui.conversation.j8.f207782a, com.tencent.mm.ui.conversation.o8.f207946a);

    @Override // com.tencent.mm.ui.conversation.p5
    public boolean a(com.tencent.mm.ui.conversation.e8 context, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Iterator it = f207815b.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.conversation.p5) it.next()).a(context, jSONObject)) {
                return true;
            }
        }
        return false;
    }
}
