package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f139362d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f139363e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard f139364f;

    public z(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard) {
        this.f139364f = chatRoomListCard;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.LinkedList) this.f139362d).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r21, int r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.z.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard = this.f139364f;
        return new com.tencent.mm.plugin.game.chatroom.view.b0(chatRoomListCard, android.view.LayoutInflater.from(chatRoomListCard.f138896f2).inflate(com.tencent.mm.R.layout.f488386rw, viewGroup, false));
    }
}
