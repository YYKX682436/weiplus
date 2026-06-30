package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.i1.class)
/* loaded from: classes5.dex */
public class yh extends com.tencent.mm.ui.chatting.component.a implements sb5.i1, ih3.m {

    /* renamed from: e, reason: collision with root package name */
    public me5.e f200315e;

    /* renamed from: f, reason: collision with root package name */
    public me5.g f200316f;

    /* renamed from: g, reason: collision with root package name */
    public me5.p f200317g;

    /* renamed from: h, reason: collision with root package name */
    public hh3.d f200318h;

    /* renamed from: i, reason: collision with root package name */
    public me5.n f200319i;

    /* renamed from: m, reason: collision with root package name */
    public d14.f f200320m;

    /* renamed from: n, reason: collision with root package name */
    public me5.a f200321n;

    /* renamed from: o, reason: collision with root package name */
    public me5.c f200322o;

    /* renamed from: p, reason: collision with root package name */
    public me5.b f200323p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f200324q;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        me5.e eVar = this.f200315e;
        if (eVar != null) {
            eVar.c();
            this.f200315e = null;
        }
        me5.g gVar = this.f200316f;
        if (gVar != null) {
            gVar.c();
            this.f200316f = null;
        }
        me5.p pVar = this.f200317g;
        if (pVar != null) {
            pVar.c();
            this.f200317g = null;
        }
        hh3.d dVar = this.f200318h;
        if (dVar != null) {
            dVar.c();
            this.f200318h = null;
        }
        me5.n nVar = this.f200319i;
        if (nVar != null) {
            nVar.c();
            this.f200319i = null;
        }
        d14.f fVar = this.f200320m;
        if (fVar != null) {
            fVar.c();
            this.f200320m = null;
        }
        me5.a aVar = this.f200321n;
        if (aVar != null) {
            aVar.c();
            this.f200321n = null;
        }
        me5.c cVar = this.f200322o;
        if (cVar != null) {
            cVar.c();
            this.f200322o = null;
        }
        me5.b bVar = this.f200323p;
        if (bVar != null) {
            bVar.c();
            this.f200323p = null;
        }
    }

    public void m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.util.LinkedList linkedList4, java.util.LinkedList linkedList5, com.tencent.mm.storage.f9 f9Var) {
        android.content.Intent intent = new android.content.Intent(this.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.class);
        intent.putExtra("msgLocalId", f9Var.getMsgId());
        intent.putExtra("msgSvrId", f9Var.I0());
        intent.putExtra("msgTalker", f9Var.Q0());
        intent.putExtra("invitertitle", this.f198580d.s().getString(com.tencent.mm.R.string.f489794bv, java.lang.Integer.valueOf(linkedList.size())));
        intent.putExtra("inviterusername", str);
        intent.putExtra("chatroom", str5);
        intent.putExtra("inviterappid", str2);
        intent.putExtra("inviterdescid", str3);
        intent.putExtra("invitationreason", str4);
        intent.putExtra("ticket", str6);
        intent.putExtra(dm.i4.COL_USERNAME, com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","));
        intent.putExtra("nickname", com.tencent.mm.sdk.platformtools.t8.c1(linkedList2, ","));
        intent.putExtra("descid", com.tencent.mm.sdk.platformtools.t8.c1(linkedList3, ","));
        intent.putExtra("appid", com.tencent.mm.sdk.platformtools.t8.c1(linkedList4, ","));
        intent.putExtra("headimgurl", com.tencent.mm.sdk.platformtools.t8.c1(linkedList5, ","));
        yb5.d dVar = this.f198580d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void n0(android.view.View view, java.util.LinkedList linkedList, java.lang.String str) {
        if (this.f200324q == null) {
            this.f200324q = new com.tencent.mm.ui.tools.s6(this.f198580d.g());
        }
        this.f200324q.a(view, new com.tencent.mm.ui.chatting.component.vh(this), new com.tencent.mm.ui.chatting.component.xh(this, linkedList, str), null);
    }

    public final void o0(long j17, java.util.LinkedList linkedList, int i17) {
        if (!((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198753r) {
            ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) this.f198580d.f460708c.a(sb5.n.class))).n0(j17, linkedList, 1, i17);
            return;
        }
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
        aVar.getClass();
        r01.q3.Ui().z0(aVar.w0());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.List w07 = aVar.f198744f.w0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (w07 != null && w07.contains(str)) {
                linkedList2.add(str);
            }
        }
        java.lang.String str2 = null;
        if (linkedList2.size() == 0) {
            if (linkedList.size() == 1) {
                db5.e1.y(aVar.f198580d.g(), aVar.f198580d.s().getString(com.tencent.mm.R.string.i4k), null, aVar.f198580d.s().getString(com.tencent.mm.R.string.i4l), new com.tencent.mm.ui.chatting.component.biz.e(aVar));
                return;
            } else {
                db5.e1.y(aVar.f198580d.g(), aVar.f198580d.s().getString(com.tencent.mm.R.string.i4g), null, aVar.f198580d.s().getString(com.tencent.mm.R.string.i4l), new com.tencent.mm.ui.chatting.component.biz.f(aVar));
                return;
            }
        }
        android.content.res.Resources s17 = aVar.f198580d.s();
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (linkedList2.size() > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(aVar.f198744f.v0((java.lang.String) linkedList2.get(0)));
            for (int i18 = 1; i18 < linkedList2.size(); i18++) {
                sb6.append(aVar.f198580d.g().getString(com.tencent.mm.R.string.b08));
                sb6.append(aVar.f198744f.v0((java.lang.String) linkedList2.get(i18)));
            }
            str2 = sb6.toString();
        }
        objArr[0] = str2;
        db5.e1.C(aVar.f198580d.g(), s17.getString(com.tencent.mm.R.string.i4e, objArr), null, aVar.f198580d.s().getString(com.tencent.mm.R.string.i4m), aVar.f198580d.s().getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.ui.chatting.component.biz.g(aVar, linkedList2), new com.tencent.mm.ui.chatting.component.biz.h(aVar));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f200317g = new me5.p(this);
        this.f200316f = new me5.g(this);
        this.f200315e = new me5.e(this);
        this.f200318h = new hh3.d(this);
        this.f200319i = new me5.n(this);
        this.f200320m = new d14.f(this);
        this.f200321n = new me5.a(this);
        this.f200322o = new me5.c(this);
        this.f200323p = new me5.b(this);
    }
}
