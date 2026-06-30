package ja4;

/* loaded from: classes4.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f298631d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f298632e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f298633f;

    public i(android.content.Context context) {
        this.f298632e = context;
        this.f298633f = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f298631d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (cb3.a) this.f298631d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ja4.h hVar;
        android.view.View view2;
        java.lang.String charSequence;
        if (view == null) {
            view2 = this.f298633f.inflate(com.tencent.mm.R.layout.csf, viewGroup, false);
            hVar = new ja4.h(this);
            hVar.f298626a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.j6l);
            hVar.f298627b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j6p);
            hVar.f298628c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j6q);
            hVar.f298629d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j6j);
            hVar.f298630e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j6n);
            view2.setTag(hVar);
        } else {
            hVar = (ja4.h) view.getTag();
            view2 = view;
        }
        cb3.a aVar = (cb3.a) this.f298631d.get(i17);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f40343a, true);
        java.lang.String str = aVar.f40343a;
        if (str != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(hVar.f298626a, aVar.f40343a);
        } else {
            com.tencent.mars.xlog.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", str);
        }
        android.widget.TextView textView = hVar.f298628c;
        long j17 = aVar.f40344b * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        android.content.Context context = this.f298632e;
        if (j17 < 3600000) {
            charSequence = "";
        } else {
            long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                android.text.format.Time time = new android.text.format.Time();
                time.set(j17);
                charSequence = k35.s.a(context.getString(com.tencent.mm.R.string.f492138fc5, " "), time).toString();
            } else {
                charSequence = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(j17));
            }
        }
        textView.setText(charSequence);
        hVar.f298628c.setVisibility(0);
        if (n17 != null) {
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, hVar.f298627b, n17.g2());
        } else {
            com.tencent.mars.xlog.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", aVar.f40343a);
        }
        r45.vv3 vv3Var = new r45.vv3();
        try {
            r45.cu5 cu5Var = aVar.f40345c;
            if (cu5Var == null || cu5Var.f371839d <= 0) {
                hVar.f298629d.setVisibility(8);
                hVar.f298630e.setVisibility(0);
            } else {
                vv3Var.parseFrom(x51.j1.d(cu5Var));
                long j18 = vv3Var.f388604d;
                if (j18 > 0) {
                    hVar.f298629d.setText(context.getString(com.tencent.mm.R.string.gna, com.tencent.mm.wallet_core.ui.r1.o(j18 / 100.0d)));
                    hVar.f298630e.setVisibility(8);
                } else {
                    hVar.f298629d.setVisibility(8);
                    hVar.f298630e.setVisibility(0);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsLuckyMoneyReceivedRecordListAdapter", e17.getMessage() + "hbBuffer is error");
            hVar.f298629d.setVisibility(8);
            hVar.f298630e.setVisibility(8);
            hVar.f298626a.setVisibility(8);
            hVar.f298627b.setVisibility(8);
            hVar.f298628c.setVisibility(8);
        }
        return view2;
    }
}
