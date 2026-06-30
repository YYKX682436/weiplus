package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ik implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f204191d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.n4 f204192e = new com.tencent.mm.ui.chatting.viewitems.fk(this);

    /* renamed from: f, reason: collision with root package name */
    public final db5.t4 f204193f = new com.tencent.mm.ui.chatting.viewitems.gk(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f204194g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f204195h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f204196i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f204197m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f204198n;

    public ik(yb5.d dVar) {
        this.f204191d = dVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "open menu but tag is null");
        } else {
            rl5.r rVar = this.f204198n;
            if (rVar != null) {
                rVar.a();
                this.f204198n = null;
            }
            yb5.d dVar = this.f204191d;
            rl5.r rVar2 = new rl5.r(dVar.g());
            this.f204198n = rVar2;
            rVar2.C = true;
            rVar2.L = new com.tencent.mm.ui.chatting.viewitems.hk(this, view);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f204198n.f(view, this.f204192e, this.f204193f, iArr[0] + ((int) (view.getWidth() / 2.0f)), iArr[1]);
            dVar.P(false);
            dVar.V(false);
            dVar.f460728w = false;
        }
        if (view.findViewById(com.tencent.mm.R.id.i2h) != null) {
            view.findViewById(com.tencent.mm.R.id.i2h).setBackgroundColor(view.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        } else if (view.findViewById(com.tencent.mm.R.id.f484097d03) != null) {
            view.findViewById(com.tencent.mm.R.id.f484097d03).setBackgroundColor(view.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
