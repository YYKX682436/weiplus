package e43;

/* loaded from: classes4.dex */
public abstract class f {
    public static final boolean a(com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo org2, com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(org2, "org");
        kotlin.jvm.internal.o.g(channelInfo, "channelInfo");
        if (org2.default_channel_id == channelInfo.default_channel_id) {
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> linkedList = org2.channel_list;
            if (linkedList != null && linkedList.size() == channelInfo.channel_list.size()) {
                java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.Channel> it = channelInfo.channel_list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.Channel next = it.next();
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> channel_list = org2.channel_list;
                    kotlin.jvm.internal.o.f(channel_list, "channel_list");
                    java.util.Iterator<T> it6 = channel_list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it6.next();
                        if (((com.tencent.mm.plugin.game.autogen.chatroom.Channel) obj).channel_id == next.channel_id) {
                            break;
                        }
                    }
                    if (obj == null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
