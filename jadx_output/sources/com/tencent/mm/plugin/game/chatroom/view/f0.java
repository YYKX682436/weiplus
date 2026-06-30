package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes4.dex */
public class f0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView f139105d;

    public f0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView) {
        this.f139105d = chatRoomListView;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse getFirstEnterInfoResponse;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "showFirstGuidance, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139105d;
        if (!((android.app.Activity) chatRoomListView.f138901f2).isFinishing() && !((android.app.Activity) chatRoomListView.f138901f2).isDestroyed() && i17 == 0 && i18 == 0 && (getFirstEnterInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse) oVar.f70711b.f70700a) != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = getFirstEnterInfoResponse.enter_jump_info;
            if (jumpInfo != null) {
                s33.y.h(chatRoomListView.f138901f2, jumpInfo);
                chatRoomListView.o1(2);
            } else if (!com.tencent.mm.sdk.platformtools.t8.L0(getFirstEnterInfoResponse.content_list)) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> it = getFirstEnterInfoResponse.content_list.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock next = it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(next.content)) {
                        com.tencent.mm.plugin.game.autogen.chatroom.Color color = next.color;
                        java.lang.String str2 = color != null ? com.tencent.mm.ui.bk.C() ? color.dark_color : color.light_color : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.Integer l17 = s33.y.l(str2);
                        if (l17 == null) {
                            l17 = java.lang.Integer.valueOf(chatRoomListView.f138901f2.getResources().getColor(com.tencent.mm.R.color.FG_2));
                        }
                        spannableStringBuilder.append((java.lang.CharSequence) next.content);
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(l17.intValue()), i19, next.content.length() + i19, 33);
                        i19 = spannableStringBuilder.length();
                    }
                }
                if (spannableStringBuilder.length() == 0) {
                    return 0;
                }
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(chatRoomListView.getContext(), 2, 0, true);
                z2Var.y(chatRoomListView.getResources().getString(com.tencent.mm.R.string.fkz));
                z2Var.x(1);
                z2Var.F = new com.tencent.mm.plugin.game.chatroom.view.g0(chatRoomListView, z2Var);
                android.view.View inflate = android.view.LayoutInflater.from(chatRoomListView.getContext()).inflate(com.tencent.mm.R.layout.f489142bf3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bfy);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bfz);
                if (com.tencent.mm.ui.bk.C()) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.big);
                } else {
                    imageView.setImageResource(com.tencent.mm.R.drawable.bii);
                }
                textView.setText(spannableStringBuilder);
                z2Var.j(inflate);
                z2Var.C();
                chatRoomListView.o1(1);
            }
        }
        return 0;
    }
}
