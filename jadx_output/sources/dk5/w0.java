package dk5;

/* loaded from: classes.dex */
public class w0 extends o65.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f234967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MMCreateChatroomUI f234968m;

    public w0(com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f234968m = mMCreateChatroomUI;
        this.f234967l = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        java.lang.String str2;
        boolean z17;
        o65.d dVar = (o65.d) bVar;
        com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI = this.f234968m;
        mMCreateChatroomUI.I = false;
        if (com.tencent.mm.ui.pc.a(mMCreateChatroomUI, i17, i18, str, 4)) {
            return;
        }
        java.lang.String str3 = "";
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f343218i)) {
            com.tencent.mm.roomsdk.model.factory.a aVar = this.f234967l;
            if (aVar.f192245a) {
                c01.t1.c(this.f343218i, dVar.f343210a, mMCreateChatroomUI.getString(com.tencent.mm.R.string.f490846b06), false, "");
            }
            java.util.List list = dVar.f343214e;
            if (list != null && list.size() > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i19 = 0; i19 < list.size(); i19++) {
                    linkedList.add((java.lang.String) list.get(i19));
                }
                java.lang.String str4 = "weixin://findfriend/verifycontact/" + this.f343218i + "/";
                if (aVar.f192245a) {
                    c01.t1.c(this.f343218i, linkedList, mMCreateChatroomUI.getString(com.tencent.mm.R.string.b07), true, str4);
                }
            }
            java.lang.String str5 = this.f343218i;
            android.content.Intent intent = new android.content.Intent();
            if (mMCreateChatroomUI.D) {
                intent.putExtra("Chat_User", str5);
                j45.l.u(mMCreateChatroomUI, ".ui.chatting.ChattingUI", intent, null);
            } else {
                intent.putExtra("Select_Contact", str5);
                intent.putExtra("Select_Conv_User", str5);
                intent.putExtra("Select_Contact", str5);
                intent.putExtra("need_delete_chatroom_when_cancel", true);
                mMCreateChatroomUI.setResult(-1, intent);
            }
            mMCreateChatroomUI.finish();
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
        if (i18 == -23) {
            str2 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.i5f);
            str3 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.i5e);
        } else {
            str2 = "";
        }
        java.util.List list2 = dVar.f343214e;
        java.util.List list3 = dVar.f343212c;
        if (list2 != null && list2.size() > 0 && (list2.size() == dVar.f343217h || (list3 != null && list3.size() > 0 && dVar.f343217h == list2.size() + list3.size()))) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (int i27 = 0; i27 < list2.size(); i27++) {
                linkedList2.add((java.lang.String) list2.get(i27));
            }
            iz5.a.g(null, linkedList2.size() > 0);
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(linkedList2);
            arrayList.addAll(list3);
            db5.e1.C(mMCreateChatroomUI, mMCreateChatroomUI.getString(com.tencent.mm.R.string.fcr, com.tencent.mm.sdk.platformtools.t8.c1(mMCreateChatroomUI.y7(arrayList), string2)), mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492386gb0), mMCreateChatroomUI.getString(com.tencent.mm.R.string.fcq), mMCreateChatroomUI.getString(com.tencent.mm.R.string.fcp), true, new dk5.y0(mMCreateChatroomUI, linkedList2), null);
            return;
        }
        java.util.List list4 = dVar.f343212c;
        if (list4 != null && list4.size() > 0 && dVar.f343217h == list4.size()) {
            str2 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492386gb0);
            str3 = str3 + mMCreateChatroomUI.getString(com.tencent.mm.R.string.fcg, com.tencent.mm.sdk.platformtools.t8.c1(mMCreateChatroomUI.y7(list4), string));
        }
        java.util.List list5 = dVar.f343211b;
        if (list5 != null && list5.size() > 0) {
            java.util.Iterator it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                        str2 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492386gb0);
                        str3 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492387gb1);
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                str2 = mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492386gb0);
                str3 = str3 + mMCreateChatroomUI.getString(com.tencent.mm.R.string.fcj, com.tencent.mm.sdk.platformtools.t8.c1(mMCreateChatroomUI.y7(list5), string));
            }
        }
        if (str2 == null || str2.length() <= 0) {
            dp.a.makeText(mMCreateChatroomUI, mMCreateChatroomUI.getString(com.tencent.mm.R.string.f492134fc1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        } else {
            db5.e1.s(mMCreateChatroomUI, str3, str2);
        }
    }
}
