package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes14.dex */
public class a extends androidx.fragment.app.y1 implements u33.l {

    /* renamed from: i, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f138744i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f138745m;

    public a(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f138745m = new java.util.ArrayList();
        this.f138744i = fragmentManager;
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        java.util.Iterator it = ((java.util.ArrayList) this.f138745m).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next()).I(map);
        }
    }

    public com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment b(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f138745m).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
            com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = chatChannelFragment.f138711g;
            if (channel != null && channel.channel_id == i17) {
                return chatChannelFragment;
            }
        }
        return null;
    }

    @Override // u33.l
    public void c0(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f138745m).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next()).c0(i17);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return ((java.util.ArrayList) this.f138745m).size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        java.util.List list = this.f138745m;
        return (androidx.fragment.app.Fragment) ((java.util.ArrayList) list).get(i17 % ((java.util.ArrayList) list).size());
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        return -2;
    }

    @Override // androidx.fragment.app.y1, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) super.instantiateItem(viewGroup, i17);
        java.lang.String tag = chatChannelFragment.getTag();
        if (chatChannelFragment == getItem(i17)) {
            return chatChannelFragment;
        }
        androidx.fragment.app.i2 beginTransaction = this.f138744i.beginTransaction();
        beginTransaction.j(chatChannelFragment);
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment2 = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) getItem(i17);
        beginTransaction.h(viewGroup.getId(), chatChannelFragment2, tag, 1);
        beginTransaction.b(new androidx.fragment.app.h2(7, chatChannelFragment2));
        beginTransaction.e();
        return chatChannelFragment2;
    }
}
