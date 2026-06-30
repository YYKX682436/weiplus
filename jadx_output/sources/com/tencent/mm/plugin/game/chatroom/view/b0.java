package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class b0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f139033d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f139034e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f139035f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f139036g;

    /* renamed from: h, reason: collision with root package name */
    public int f139037h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo f139038i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard f139039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard, android.view.View view) {
        super(view);
        this.f139039m = chatRoomListCard;
        this.f139033d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483618bg3);
        this.f139034e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483615bg0);
        this.f139035f = view.findViewById(com.tencent.mm.R.id.osw);
        this.f139036g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bfx);
        view.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.a0(this, chatRoomListCard));
    }
}
