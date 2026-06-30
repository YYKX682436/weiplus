package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class g0 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206713d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f206714e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f206715f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f206716g;

    public g0(android.content.Context context, com.tencent.mm.ui.contact.f0 itemType) {
        super(context);
        this.f206714e = null;
        this.f206715f = null;
        this.f206716g = null;
        this.f206713d = context;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f487987dd, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cg7);
        this.f206714e = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.f482757n7);
        this.f206715f = findViewById2;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = (int) (i65.a.f(context, com.tencent.mm.R.dimen.f479613ao) * i65.a.A(context));
        this.f206715f.setLayoutParams(layoutParams);
        this.f206716g = (android.widget.TextView) this.f206715f.findViewById(com.tencent.mm.R.id.f482759n9);
        android.view.View view = this.f206714e;
        kotlin.jvm.internal.o.g(itemType, "itemType");
        int ordinal = itemType.ordinal();
        int i17 = ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? 0 : 2 : 4 : 3;
        if (view != null) {
            android.content.Context context2 = view.getContext();
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "addressbook_cell");
            aVar.fk(view, "addressbook_cell_type", java.lang.Integer.valueOf(i17));
            aVar.Ai(view, new tf5.k(context2));
            aVar.ik(view, 8, 33926);
        }
        this.f206714e.setOnClickListener(new com.tencent.mm.ui.contact.d0(this, itemType));
        this.f206715f.setOnTouchListener(new com.tencent.mm.ui.contact.e0(this));
        android.widget.ImageView imageView = (android.widget.ImageView) ((com.tencent.mm.ui.base.MaskLayout) this.f206715f.findViewById(com.tencent.mm.R.id.f482758n8)).getContentView();
        int ordinal2 = itemType.ordinal();
        if (ordinal2 == 0) {
            this.f206716g.setText(com.tencent.mm.R.string.f489865dw);
            com.tencent.mm.modelavatar.z.e(getContext(), imageView, com.tencent.mm.R.raw.default_chatroom);
            return;
        }
        if (ordinal2 == 1) {
            this.f206716g.setText(com.tencent.mm.R.string.f489873e4);
            com.tencent.mm.modelavatar.z.e(getContext(), imageView, com.tencent.mm.R.raw.default_contactlabel);
        } else if (ordinal2 == 2) {
            this.f206715f.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            this.f206716g.setText(com.tencent.mm.R.string.f489872e3);
            com.tencent.mm.modelavatar.z.e(getContext(), imageView, com.tencent.mm.R.raw.default_ipcall);
        } else {
            if (ordinal2 != 3) {
                return;
            }
            this.f206716g.setText(com.tencent.mm.R.string.f489874e5);
            com.tencent.mm.modelavatar.z.e(getContext(), imageView, com.tencent.mm.R.drawable.c09);
        }
    }

    public void setVisible(boolean z17) {
        android.view.View view = this.f206714e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
