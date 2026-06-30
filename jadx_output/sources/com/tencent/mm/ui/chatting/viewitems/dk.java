package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class dk {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f203803a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f203804b;

    /* renamed from: c, reason: collision with root package name */
    public long f203805c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f203806d;

    /* renamed from: e, reason: collision with root package name */
    public int f203807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f203808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f203809g;

    /* renamed from: h, reason: collision with root package name */
    public int f203810h;

    public static com.tencent.mm.ui.chatting.viewitems.dk a(java.util.Map map) {
        com.tencent.mm.ui.chatting.viewitems.dk dkVar = new com.tencent.mm.ui.chatting.viewitems.dk();
        dkVar.f203803a = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.title");
        dkVar.f203804b = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.url");
        dkVar.f203809g = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.native_url");
        dkVar.f203805c = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.pub_time"), 0L);
        com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
        dkVar.f203806d = (java.lang.String) map.get(".msg.appmsg.template_id");
        dkVar.f203807e = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.a1(map);
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.title");
        if (str == null) {
            str = "";
        }
        dkVar.f203808f = str;
        dkVar.f203810h = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map);
        return dkVar;
    }
}
