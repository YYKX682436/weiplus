package sc2;

/* loaded from: classes2.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.e5 f405831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405835h;

    public d5(sc2.e5 e5Var, android.content.Context context, xc2.p0 p0Var, android.view.View view, java.lang.String str) {
        this.f405831d = e5Var;
        this.f405832e = context;
        this.f405833f = p0Var;
        this.f405834g = view;
        this.f405835h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.mt4 next_object_info;
        java.lang.String necessary_params;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FeedJumperSubtitleBubbleObserver$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f405832e;
        kotlin.jvm.internal.o.f(context, "$context");
        sc2.e5 e5Var = this.f405831d;
        e5Var.getClass();
        xc2.p0 p0Var = this.f405833f;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = p0Var.f453234a.getNative_info();
        byte[] bArr = null;
        bArr = null;
        java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
        str = "";
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
        if (valueOf != null && valueOf.intValue() == 55) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo.getNative_info();
            if (native_info2 != null && (necessary_params = native_info2.getNecessary_params()) != null) {
                str = necessary_params;
            }
            r45.qj2 qj2Var = new r45.qj2();
            qj2Var.fromJson(str);
            z7.l a17 = z7.a.a(str);
            if (a17 instanceof z7.i) {
                qj2Var.set(0, java.lang.Long.valueOf(pm0.v.Z(((z7.i) a17).j(dm.i4.COL_ID).toString())));
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i18 = nyVar != null ? nyVar.f135380n : 0;
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            long j17 = qj2Var.getLong(0);
            com.tencent.mm.protocal.protobuf.NativeInfo native_info3 = finderJumpInfo.getNative_info();
            i0Var.ak(context, null, j17, (native_info3 == null || (next_object_info = native_info3.getNext_object_info()) == null) ? 0L : next_object_info.getLong(0), null, qj2Var.getString(1), e5Var.f3145f, e5Var.f3146g, i18, qj2Var.getString(9));
            i17 = 1;
        } else {
            i17 = 1;
            r45.vx0 vx0Var = new r45.vx0();
            com.tencent.mm.protocal.protobuf.NativeInfo native_info4 = finderJumpInfo.getNative_info();
            if (native_info4 == null || (str2 = native_info4.getNecessary_params()) == null) {
                str2 = "";
            }
            vx0Var.fromJson(str2);
            java.lang.String string = vx0Var.getString(20);
            if ((string == null || string.length() == 0) != false) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
                vx0Var = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (object_extend = feedObject2.getObject_extend()) == null) ? null : (r45.vx0) object_extend.getCustom(0);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", 16);
            java.lang.String string2 = vx0Var.getString(1);
            str = string2 != null ? string2 : "";
            long Z = pm0.v.Z(vx0Var.getString(20));
            r45.mk2 mk2Var = (r45.mk2) vx0Var.getCustom(19);
            long Z2 = pm0.v.Z(mk2Var != null ? mk2Var.getString(2) : null);
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", Z);
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            intent.putExtra("key_ref_object_id", Z2);
            intent.putExtra("key_topic_type", vx0Var.getInteger(21));
            r45.mk2 mk2Var2 = (r45.mk2) vx0Var.getCustom(19);
            if (mk2Var2 != null && (byteString = mk2Var2.getByteString(1)) != null) {
                bArr = byteString.f192156a;
            }
            intent.putExtra("KEY_NEXT_OBJECT_BUFFER", bArr);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(context, intent);
        }
        xc2.n nVar = xc2.n.f453212a;
        kotlin.jvm.internal.o.f(context, "$context");
        android.view.View view2 = this.f405834g;
        xc2.p0 p0Var2 = this.f405833f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("click_control_str", this.f405835h);
        jSONObject.put("phase", i17);
        xc2.n.b(nVar, context, view2, p0Var2, 0, null, null, jSONObject, null, 184, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperSubtitleBubbleObserver$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
