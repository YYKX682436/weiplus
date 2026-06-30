package tl1;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl1.v f420217d;

    public s(tl1.v vVar) {
        this.f420217d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl1.v vVar = this.f420217d;
        vVar.f420226o.setBackground(b3.l.getDrawable(vVar.getContext(), com.tencent.mm.R.drawable.f480810d3));
        vVar.f420220f.setTextColor(b3.l.getColor(vVar.getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_9));
        vVar.f420222h.setBackgroundColor(b3.l.getColor(vVar.getContext(), com.tencent.mm.R.color.f478494f));
        ((android.widget.Button) vVar.f420222h.findViewById(com.tencent.mm.R.id.azh)).setTextColor(b3.l.getColor(vVar.getContext(), com.tencent.mm.R.color.f478838io));
        ((android.widget.Button) vVar.f420222h.findViewById(com.tencent.mm.R.id.azh)).setBackground(b3.l.getDrawable(vVar.getContext(), com.tencent.mm.R.drawable.f481057jk));
        ((android.widget.Button) vVar.f420222h.findViewById(com.tencent.mm.R.id.azg)).setTextColor(b3.l.getColor(vVar.getContext(), com.tencent.mm.R.color.aax));
        ((android.widget.Button) vVar.f420222h.findViewById(com.tencent.mm.R.id.azg)).setBackground(b3.l.getDrawable(vVar.getContext(), com.tencent.mm.R.drawable.f481068jy));
    }
}
