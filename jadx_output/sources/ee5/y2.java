package ee5;

/* loaded from: classes9.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.a3 f252096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(ee5.a3 a3Var) {
        super(1);
        this.f252096d = a3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof android.widget.TextView) {
            ee5.a3 a3Var = this.f252096d;
            androidx.appcompat.app.AppCompatActivity activity = a3Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).O6();
            java.lang.Object tag = ((android.widget.TextView) it).getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag).intValue();
            if (!com.tencent.mm.storage.z3.R4(a3Var.f251817f)) {
                intValue++;
            }
            switch (intValue) {
                case 0:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSearchMemberDetail");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("from_scene", 1);
                    intent.putExtra("RoomInfo_Id", a3Var.f251817f);
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, a3Var.getActivity().getResources().getString(com.tencent.mm.R.string.ic8));
                    j45.l.u(a3Var.getActivity(), "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, null);
                    break;
                case 1:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSearchDateDetail");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("detail_username", a3Var.f251817f);
                    j45.l.u(a3Var.getActivity(), "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
                    break;
                case 2:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeImageVideoHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("kintent_talker", a3Var.f251817f);
                        intent3.putExtra("key_media_type", 1);
                        intent3.putExtra("key_gallery_enter_scene", 4);
                        intent3.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI.class);
                        intent3.addFlags(67108864);
                        a3Var.getActivity().startActivityForResult(intent3, 1);
                        break;
                    } else {
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("kTalker", a3Var.f251817f);
                        intent4.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.q.f201782f.getClass().getName());
                        intent4.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity2 = a3Var.getActivity();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeImageVideoHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity2.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activity2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeImageVideoHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 3:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFileHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("kintent_talker", a3Var.f251817f);
                        intent5.putExtra("key_media_type", 2);
                        android.os.Bundle bundle = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        intent5.putExtra("detail_user_dismiss", a3Var.f251818g);
                        de5.a.f229396a.j(9, 1);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
                        break;
                    } else {
                        android.content.Intent intent6 = new android.content.Intent();
                        intent6.putExtra("kTalker", a3Var.f251817f);
                        intent6.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.j.f201762f.getClass().getName());
                        intent6.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity3 = a3Var.getActivity();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent6);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activity3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFileHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity3.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activity3, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFileHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 4:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent7 = new android.content.Intent();
                        intent7.putExtra("kintent_talker", a3Var.f251817f);
                        intent7.putExtra("key_media_type", 3);
                        android.os.Bundle bundle2 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 2);
                        intent7.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle2);
                        break;
                    } else {
                        android.content.Intent intent8 = new android.content.Intent();
                        intent8.putExtra("kTalker", a3Var.f251817f);
                        intent8.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.o.f201776f.getClass().getName());
                        intent8.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity4 = a3Var.getActivity();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(activity4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeUrlHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity4.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(activity4, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeUrlHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 5:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent9 = new android.content.Intent();
                        intent9.putExtra("kintent_talker", a3Var.f251817f);
                        intent9.putExtra("key_media_type", 4);
                        android.os.Bundle bundle3 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 3);
                        intent9.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent9, bundle3);
                        break;
                    } else {
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("kTalker", a3Var.f251817f);
                        intent10.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.r.f201787f.getClass().getName());
                        intent10.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity5 = a3Var.getActivity();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent10);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(activity5, arrayList4.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeMusicHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity5.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(activity5, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeMusicHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 6:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeePayHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent11 = new android.content.Intent();
                        intent11.putExtra("kintent_talker", a3Var.f251817f);
                        intent11.putExtra("key_media_type", 5);
                        android.os.Bundle bundle4 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 4);
                        intent11.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent11, bundle4);
                        break;
                    } else {
                        android.content.Intent intent12 = new android.content.Intent();
                        intent12.putExtra("kTalker", a3Var.f251817f);
                        intent12.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.v.f201801f.getClass().getName());
                        intent12.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity6 = a3Var.getActivity();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(intent12);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(activity6, arrayList5.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeePayHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity6.startActivity((android.content.Intent) arrayList5.get(0));
                        yj0.a.f(activity6, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeePayHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 7:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeAppBrandHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent13 = new android.content.Intent();
                        intent13.putExtra("kintent_talker", a3Var.f251817f);
                        intent13.putExtra("key_media_type", 6);
                        android.os.Bundle bundle5 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 5);
                        intent13.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent13, bundle5);
                        break;
                    } else {
                        android.content.Intent intent14 = new android.content.Intent();
                        intent14.putExtra("kTalker", a3Var.f251817f);
                        intent14.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.h.f201756f.getClass().getName());
                        intent14.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity7 = a3Var.getActivity();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(intent14);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(activity7, arrayList6.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeAppBrandHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity7.startActivity((android.content.Intent) arrayList6.get(0));
                        yj0.a.f(activity7, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeAppBrandHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 8:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFinderFeedHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent15 = new android.content.Intent();
                        intent15.putExtra("kintent_talker", a3Var.f251817f);
                        android.os.Bundle bundle6 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 6);
                        intent15.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI", intent15, bundle6);
                        break;
                    } else {
                        android.content.Intent intent16 = new android.content.Intent();
                        intent16.putExtra("kTalker", a3Var.f251817f);
                        intent16.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.k.f201766f.getClass().getName());
                        intent16.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity8 = a3Var.getActivity();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(intent16);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(activity8, arrayList7.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFinderFeedHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity8.startActivity((android.content.Intent) arrayList7.get(0));
                        yj0.a.f(activity8, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFinderFeedHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 9:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeShareCardHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent17 = new android.content.Intent();
                        intent17.putExtra("kintent_talker", a3Var.f251817f);
                        intent17.putExtra("key_media_type", 104);
                        android.os.Bundle bundle7 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 8);
                        intent17.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent17, bundle7);
                        break;
                    } else {
                        android.content.Intent intent18 = new android.content.Intent();
                        intent18.putExtra("kTalker", a3Var.f251817f);
                        intent18.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.i.f201759f.getClass().getName());
                        intent18.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity9 = a3Var.getActivity();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(intent18);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(activity9, arrayList8.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShareCardHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity9.startActivity((android.content.Intent) arrayList8.get(0));
                        yj0.a.f(activity9, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShareCardHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 10:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeLocationHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent19 = new android.content.Intent();
                        intent19.putExtra("kintent_talker", a3Var.f251817f);
                        intent19.putExtra("key_media_type", 105);
                        android.os.Bundle bundle8 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 9);
                        intent19.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent19, bundle8);
                        break;
                    } else {
                        android.content.Intent intent20 = new android.content.Intent();
                        intent20.putExtra("kTalker", a3Var.f251817f);
                        intent20.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.p.f201779f.getClass().getName());
                        intent20.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity10 = a3Var.getActivity();
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(intent20);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(activity10, arrayList9.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeLocationHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity10.startActivity((android.content.Intent) arrayList9.get(0));
                        yj0.a.f(activity10, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeLocationHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 11:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeNoteHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent21 = new android.content.Intent();
                        intent21.putExtra("kintent_talker", a3Var.f251817f);
                        intent21.putExtra("key_media_type", 106);
                        android.os.Bundle bundle9 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 10);
                        intent21.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent21, bundle9);
                        break;
                    } else {
                        android.content.Intent intent22 = new android.content.Intent();
                        intent22.putExtra("kTalker", a3Var.f251817f);
                        intent22.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.s.f201790f.getClass().getName());
                        intent22.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity11 = a3Var.getActivity();
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(intent22);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(activity11, arrayList10.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeNoteHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity11.startActivity((android.content.Intent) arrayList10.get(0));
                        yj0.a.f(activity11, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeNoteHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 12:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeShopAndProductHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent23 = new android.content.Intent();
                        intent23.putExtra("kintent_talker", a3Var.f251817f);
                        intent23.putExtra("key_media_type", 102);
                        android.os.Bundle bundle10 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 11);
                        intent23.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent23, bundle10);
                        break;
                    } else {
                        android.content.Intent intent24 = new android.content.Intent();
                        intent24.putExtra("kTalker", a3Var.f251817f);
                        intent24.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.u.f201798f.getClass().getName());
                        intent24.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity12 = a3Var.getActivity();
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        arrayList11.add(intent24);
                        java.util.Collections.reverse(arrayList11);
                        yj0.a.d(activity12, arrayList11.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShopAndProductHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity12.startActivity((android.content.Intent) arrayList11.get(0));
                        yj0.a.f(activity12, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShopAndProductHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 13:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeGiftHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent25 = new android.content.Intent();
                        intent25.putExtra("kintent_talker", a3Var.f251817f);
                        intent25.putExtra("key_media_type", 103);
                        android.os.Bundle bundle11 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 12);
                        intent25.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent25, bundle11);
                        break;
                    } else {
                        android.content.Intent intent26 = new android.content.Intent();
                        intent26.putExtra("kTalker", a3Var.f251817f);
                        intent26.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.l.f201770f.getClass().getName());
                        intent26.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity13 = a3Var.getActivity();
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        arrayList12.add(intent26);
                        java.util.Collections.reverse(arrayList12);
                        yj0.a.d(activity13, arrayList12.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeGiftHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity13.startActivity((android.content.Intent) arrayList12.get(0));
                        yj0.a.f(activity13, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeGiftHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 14:
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeEmojiHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent27 = new android.content.Intent();
                        intent27.putExtra("kintent_talker", a3Var.f251817f);
                        android.os.Bundle bundle12 = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.getActivity(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f229396a.j(9, 7);
                        intent27.putExtra("detail_user_dismiss", a3Var.f251818g);
                        j45.l.u(a3Var.getActivity(), "com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI", intent27, bundle12);
                        break;
                    } else {
                        android.content.Intent intent28 = new android.content.Intent();
                        intent28.putExtra("kTalker", a3Var.f251817f);
                        intent28.putExtra("kDefaultType", com.tencent.mm.ui.chatting.history.groups.t.f201793f.getClass().getName());
                        intent28.setClass(a3Var.getActivity(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
                        androidx.appcompat.app.AppCompatActivity activity14 = a3Var.getActivity();
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        arrayList13.add(intent28);
                        java.util.Collections.reverse(arrayList13);
                        yj0.a.d(activity14, arrayList13.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeEmojiHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity14.startActivity((android.content.Intent) arrayList13.get(0));
                        yj0.a.f(activity14, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeEmojiHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
            }
        }
        return jz5.f0.f302826a;
    }
}
