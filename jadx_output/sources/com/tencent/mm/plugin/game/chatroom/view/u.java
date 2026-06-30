package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class u extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f139301d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView f139302e;

    public u(com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView, com.tencent.mm.plugin.game.chatroom.view.n nVar) {
        this.f139302e = chatMemberListView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.LinkedList) this.f139301d).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0281, code lost:
    
        if (r10.f139308b != r0.status) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030c  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r24, int r25) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.u.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.game.chatroom.view.t(this, android.view.LayoutInflater.from(this.f139302e.f138872f2).inflate(com.tencent.mm.R.layout.bg_, viewGroup, false));
    }
}
