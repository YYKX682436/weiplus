package kj;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f308173a = java.util.regex.Pattern.compile("^\"(.*?)\" .*? tid=(\\d+) \\w+$");

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f308174b = java.util.regex.Pattern.compile("^  - .*?\\(a (.*?)\\) held by thread (\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.StringBuilder f308175c = new java.lang.StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f308176d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f308177e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f308178f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f308179g = false;

    /* renamed from: h, reason: collision with root package name */
    public kj.z f308180h = new kj.z();

    public a0(kj.v vVar) {
    }

    public final kj.z a(kj.z zVar) {
        kj.z a17;
        java.util.LinkedList linkedList = this.f308177e;
        linkedList.addLast(zVar);
        zVar.f308281e = 1;
        kj.z zVar2 = (kj.z) this.f308176d.get(java.lang.Integer.valueOf(zVar.f308280d));
        if (zVar2 != null) {
            int i17 = zVar2.f308281e;
            if (i17 == 1) {
                return zVar2;
            }
            if (i17 == 0 && (a17 = a(zVar2)) != null) {
                return a17;
            }
        }
        zVar.f308281e = 2;
        linkedList.removeLast();
        return null;
    }

    public java.util.Map.Entry b() {
        java.util.LinkedList linkedList = this.f308177e;
        if (linkedList.size() == 0) {
            return new kj.y(null, null);
        }
        int[] iArr = new int[linkedList.size()];
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            kj.z zVar = (kj.z) it.next();
            iArr[i17] = zVar.f308277a;
            strArr[i17] = zVar.f308279c;
            i17++;
        }
        return new kj.y(iArr, strArr);
    }

    public boolean c() {
        kj.z a17;
        d("");
        java.util.LinkedList linkedList = this.f308177e;
        linkedList.clear();
        java.util.Iterator it = this.f308176d.entrySet().iterator();
        while (it.hasNext()) {
            kj.z zVar = (kj.z) ((java.util.Map.Entry) it.next()).getValue();
            if (zVar.f308281e == 0 && (a17 = a(zVar)) != null) {
                while (linkedList.size() > 0 && linkedList.getFirst() != a17) {
                    linkedList.removeFirst();
                }
                return true;
            }
        }
        return false;
    }

    public void d(java.lang.String str) {
        boolean isEmpty = str.isEmpty();
        java.lang.StringBuilder sb6 = this.f308175c;
        if (isEmpty) {
            this.f308179g = false;
            if (sb6.length() <= 0 || this.f308180h.f308280d < 0) {
                return;
            }
            java.lang.String sb7 = sb6.toString();
            kj.z zVar = this.f308180h;
            int i17 = zVar.f308277a;
            if (i17 == 1) {
                this.f308178f = sb7;
            }
            zVar.f308278b = sb7;
            this.f308176d.put(java.lang.Integer.valueOf(i17), this.f308180h);
            this.f308180h = new kj.z();
            return;
        }
        if (this.f308179g) {
            java.util.regex.Matcher matcher = this.f308174b.matcher(str);
            if (matcher.find()) {
                try {
                    this.f308180h.f308279c = matcher.group(1);
                    kj.z zVar2 = this.f308180h;
                    java.lang.String group = matcher.group(2);
                    java.util.Objects.requireNonNull(group);
                    zVar2.f308280d = java.lang.Integer.parseInt(group);
                } catch (java.lang.Exception e17) {
                    oj.j.b("SignalAnrTracer", e17.toString(), new java.lang.Object[0]);
                }
            }
            sb6.append(str);
            sb6.append('\n');
            return;
        }
        java.util.regex.Matcher matcher2 = this.f308173a.matcher(str);
        if (matcher2.find()) {
            this.f308179g = true;
            sb6.setLength(0);
            sb6.append(str);
            sb6.append('\n');
            try {
                kj.z zVar3 = this.f308180h;
                java.lang.String group2 = matcher2.group(2);
                java.util.Objects.requireNonNull(group2);
                zVar3.f308277a = java.lang.Integer.parseInt(group2);
            } catch (java.lang.Exception e18) {
                oj.j.b("SignalAnrTracer", e18.toString(), new java.lang.Object[0]);
            }
        }
    }
}
