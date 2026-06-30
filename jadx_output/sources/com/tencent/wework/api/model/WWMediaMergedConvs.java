package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaMergedConvs extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f220162f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f220163g = 0;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f220164h = null;

    @Override // com.tencent.wework.api.model.BaseMessage
    public void a(android.content.Intent intent, java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.f220162f).iterator();
        while (it.hasNext()) {
            ((com.tencent.wework.api.model.BaseMessage) it.next()).a(intent, str);
        }
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        java.util.List list;
        if (!super.b() || (list = this.f220162f) == null || ((java.util.ArrayList) list).size() == 0) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            if (!((com.tencent.wework.api.model.BaseMessage) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public void d(android.content.Context context) {
        this.f220145a = context;
        java.util.Iterator it = ((java.util.ArrayList) this.f220162f).iterator();
        while (it.hasNext()) {
            ((com.tencent.wework.api.model.BaseMessage) it.next()).d(context);
        }
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public void e(java.lang.String str) {
        this.f220146b = str;
        java.util.Iterator it = ((java.util.ArrayList) this.f220162f).iterator();
        while (it.hasNext()) {
            ((com.tencent.wework.api.model.BaseMessage) it.next()).e(str);
        }
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        java.util.List list = this.f220162f;
        bundle.putInt("_wwmergedconvobject_messageslen", ((java.util.ArrayList) list).size());
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            bundle.putBundle("_wwmergedconvobject_messages" + i17, com.tencent.wework.api.model.BaseMessage.c((com.tencent.wework.api.model.BaseMessage) ((java.util.ArrayList) list).get(i17)));
        }
        bundle.putInt("_wwmergedconvobject_forwardtype", this.f220163g);
        bundle.putByteArray("_wwmergedconvobject_forward_msg_buffer", this.f220164h);
        super.f(bundle);
    }

    public boolean g(com.tencent.wework.api.model.WWMediaConversation wWMediaConversation) {
        if (wWMediaConversation == null || !wWMediaConversation.b()) {
            return false;
        }
        ((java.util.ArrayList) this.f220162f).add(wWMediaConversation);
        return true;
    }
}
