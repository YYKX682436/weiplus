package wj5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f446801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj5.c f446803h;

    public g(java.lang.String str, boolean z17, boolean z18, in5.s0 s0Var, xj5.c cVar) {
        this.f446799d = str;
        this.f446800e = z17;
        this.f446801f = z18;
        this.f446802g = s0Var;
        this.f446803h = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f446799d;
        intent.putExtra("RoomInfo_Id", str);
        intent.putExtra("room_notice", c01.v1.d(str));
        intent.putExtra("room_notice_xml", c01.v1.g(str));
        intent.putExtra("room_notice_publish_time", c01.v1.f(str));
        intent.putExtra("room_notice_editor", c01.v1.e(str));
        intent.putExtra("from_scene", 2);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        kotlin.jvm.internal.o.f(z07, "get(...)");
        boolean z17 = this.f446800e;
        intent.putExtra("Is_RoomOwner", z17);
        boolean z18 = this.f446801f;
        intent.putExtra("Is_RoomManager", z18);
        intent.putExtra("room_member_count", z07.field_memberCount);
        ((com.tencent.mm.plugin.announcement.x) ((d81.e) i95.n0.c(d81.e.class))).Di(this.f446802g.f293121e, intent);
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct viewRoomDescTipsStruct = new com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.f61634d = viewRoomDescTipsStruct.b("ChatName", str, true);
        viewRoomDescTipsStruct.f61636f = z07.field_memberCount;
        if (z17) {
            j17 = 1;
        } else {
            j17 = z18 ? 2 : 0;
        }
        viewRoomDescTipsStruct.f61635e = j17;
        viewRoomDescTipsStruct.f61638h = viewRoomDescTipsStruct.b("NoticeId", "" + z07.field_chatroomnoticePublishTime, true);
        viewRoomDescTipsStruct.f61637g = 23L;
        viewRoomDescTipsStruct.k();
        this.f446803h.f454897e = 1;
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
